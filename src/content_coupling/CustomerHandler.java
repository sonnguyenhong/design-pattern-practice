package content_coupling;

import java.util.ArrayList;
import java.util.List;

public class CustomerHandler {
    private List<Customer> customerList;
    public CustomerHandler() {
        this.customerList = new ArrayList<Customer>();
    }

    public boolean lookup(Customer c) {
        return true;
    }

    public void handleCustomer(Customer c) {
        if(!lookup(c)) {
            addCustomer(c); // Phải viết riêng phương thức add ra đề phòng trường hợp thay đổi yêu cầu trong nghiệp vụ add, chỉ cần sửa trong hàm addCustomer()
        }
    }

    private void addCustomer(Customer c) {
        customerList.add(c);
    }
}
