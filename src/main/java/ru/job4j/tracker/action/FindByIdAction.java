package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;

public class FindByIdAction implements UserAction {
    private final Output output;

    public FindByIdAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Вывод заявки по айди ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        output.println(item != null ? item : "Заявка с введенным id: " + id + " не найдена.");
        return true;
    }
}