package ru.job4j;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName()).isEqualTo(item.getName());
    }
}