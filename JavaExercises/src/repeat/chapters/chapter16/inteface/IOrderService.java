package repeat.chapters.chapter16.inteface;

import java.time.LocalDateTime;

//by default einai public abstract
public interface IOrderService {
    void insertOrder(String address, String lastname, String firstname, String phoneNumber,
                     LocalDateTime timestamp, String item, int quantity);

    void updateOrder(Long id, String address, String lastname, String firstname, String phoneNumber,
                     LocalDateTime timestamp, String item, int quantity);

    void deleteOrder(Long id);

    String getOrder(Long id);
}
