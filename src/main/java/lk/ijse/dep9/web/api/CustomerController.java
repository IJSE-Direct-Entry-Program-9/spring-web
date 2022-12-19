package lk.ijse.dep9.web.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @PostMapping
    public String saveCustomer(@PathVariable("customerId") String id){
        System.out.println("Save Customer(): " + id);
        return "C001";
    }

    @PutMapping
    public void updateCustomer(){
        System.out.println("Update Customer()");
    }

    @DeleteMapping
    public void deleteCustomer(){
        System.out.println("Delete Customer()");
    }

    @GetMapping
    public String getAllCustomers(){
        return "Get All Customers()";
    }

    @GetMapping(params = {"page", "size"})
    public String getAllPaginatedCustomers(int page, int size){
        return "Get All Paginated Customers(), page: " + page + ", size: " + size;
    }

    @GetMapping(params = {"page", "size", "q"})
    public String findPaginatedCustomers(@RequestParam("q") String query, int page, int size){
        return "Find Paginated Customers(), query=" + query + ", page=" + page + ", size="+ size;
    }

    @GetMapping(params = "q")
    public String findCustomers(String q){
        return "Find Customers(): " + q;
    }

    @GetMapping("/{id:C\\d{3}}")
    public String getCustomer(@PathVariable String id){
        return "Get Customer() " + id;
    }
}
