package lk.ijse.dep9.web.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String saveItem(){
        return "Save Item as query String";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveItemJSON(){
        return "Save Item as JSON";
    }

    @PutMapping
    public void updateItem(){
        System.out.println("Update Item()");
    }

    @DeleteMapping
    public String deleteAllItem(){
       return "Delete all items()";
    }

    @DeleteMapping(headers = "Authorization")
    public String deleteAllItems(@RequestHeader("Authorization") String authorization){
        return "Delete all items(): " + authorization;
    }

    @DeleteMapping("/{code:I\\d{3}}")
    public String deleteItem(@PathVariable String code){
        return "Delete mapping(): " + code;
    }

    @GetMapping
    public void getItem(){
        System.out.println("Get Item()");
    }
}
