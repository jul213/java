import java.awt.Robot

Robot iso = new Robot();

iso.mouseMove(x,y);

iso.delay(2000);


iso.mousePress(
    InputEvent.BUTTON1_MASK
);

iso.mouseRelease(
    InputEvent.BUTTON1_MASK
);

iso.keyPress(KeyEvent.VK_H);