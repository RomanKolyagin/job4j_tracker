package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class TestSortAscByName {
    @Test
    public void whenItemsSortAscByName() {
        Item test1 = new Item("Banana");
        Item test2 = new Item("Orange");
        Item test3 = new Item("Potato");
        List<Item> items = Arrays.asList(test2, test1, test3);
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(test1, test2, test3);
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenItemsSortDescByName() {
        Item test1 = new Item("Banana");
        Item test2 = new Item("Orange");
        Item test3 = new Item("Potato");
        List<Item> items = Arrays.asList(test2, test1, test3);
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(test3, test2, test1);
        assertThat(items).isEqualTo(expected);
    }
}