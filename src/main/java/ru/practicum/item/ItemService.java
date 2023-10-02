package ru.practicum.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;
    private Long itemId;

    public ItemService(ItemRepository itemRepository) {
        itemId = 0L;
        this.itemRepository = itemRepository;
    }

    public List<Item> getItems(long userId){
        return itemRepository.findByUserId(userId);
    }

    public Item addNewItem(Long userId, Item item){
        item.setId(getNewItemId());
        item.setUserId(userId);
        return itemRepository.save(item);
    }

    public void deleteItem(long userId, long itemId) {
        itemRepository.deleteByUserIdAndItemId(userId, itemId);
    }

    private Long getNewItemId(){
        return ++itemId;
    }

}
