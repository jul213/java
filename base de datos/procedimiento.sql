create procedure addkl(in act_id, in film_id, in typePrize varchar(50))

begin

start transaction;

create table if not exists empresa.bless (
    actor_id int not null,
    film_id int not null,
    type_oscar varchar(45) not null,
    primary key(actor_id, film_id, type_oscar)
);

end

