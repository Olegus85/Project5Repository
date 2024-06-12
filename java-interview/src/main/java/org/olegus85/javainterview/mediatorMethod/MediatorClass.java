package org.olegus85.javainterview.mediatorMethod;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MediatorClass {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        AbstractButton button1 = new Button1("1", mediator, false);
        AbstractButton button2 = new Button2("2", mediator, false);
        AbstractButton button3 = new Button3("3", mediator, false);

        mediator.addButtons(button1, button2, button3);

        button2.press();

    }

}

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
abstract class AbstractButton {
    private String buttonNumber;
    private Mediator mediator;
    private boolean isPressed;

    public abstract void press();
}

class Button1 extends AbstractButton {
    public Button1(String buttonNumber, Mediator mediator, boolean isPressed) {
        super(buttonNumber, mediator, isPressed);
    }

    public void press() {
        getMediator().pressOneUnpressAllOthers(this);
    }

}

class Button2 extends AbstractButton {
    public Button2(String buttonNumber, Mediator mediator, boolean isPressed) {
        super(buttonNumber, mediator, isPressed);
    }

    public void press() {
        getMediator().pressOneUnpressAllOthers(this);
    }

}

class Button3 extends AbstractButton {
    public Button3(String buttonNumber, Mediator mediator, boolean isPressed) {
        super(buttonNumber, mediator, isPressed);
    }

    public void press() {
        getMediator().pressOneUnpressAllOthers(this);
    }

}

class Mediator {
    List<AbstractButton> list;

    public void addButtons(AbstractButton... butts) {
        list = Arrays.asList(butts);
    }

    public void pressOneUnpressAllOthers(AbstractButton button) {
        button.setPressed(true);

        list.stream()
                .filter(x -> !Objects.equals(x, button))
                .forEach(x -> {
                    x.setPressed(false);
                    System.out.println(x.getButtonNumber() + " " + x.isPressed());
                });

        System.out.println(button.getButtonNumber() + " " + button.isPressed());
    }
}