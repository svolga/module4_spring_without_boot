package ru.practicum.item;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    Map<Long, Item> items = new HashMap<>();

    @Override
    public List<Item> findByUserId(long userId) {
        return items.values().stream()
                .filter(item -> item.getUserId() == userId)
                .collect(Collectors.toList());
    }

    @Override
    public Item save(Item item) {
        items.put(item.getId(), item);
        return items.get(item.getId());
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {
        items.values()
                .removeIf(item -> item.getId() == itemId && item.getUserId() == userId);
    }


}
