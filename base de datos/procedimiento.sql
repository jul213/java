create procedure addkl(in act_id, in film_id, in typePrize varchar(50))

begin
declare cnt int;
start transaction;

create table if not exists empresa.bless (
    actor_id int not null,
    film_id int not null,
    type_oscar varchar(45) not null,
    primary key(actor_id, film_id, type_oscar)
);

select @cnt:=count(*) from film_actor where actor_id = 2 and film_id = 3;

if @cnt >=1 then
    insert into bless(actor_id, film_id, type_oscar) values (act_id, film_id, typePrize);
end if

commit;
end

