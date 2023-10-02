package ru.practicum.item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface ItemRepository {

    List<Item> findByUserId(long userId);

    Item save(Item item);

    void deleteByUserIdAndItemId(long userId, long itemId);
}
