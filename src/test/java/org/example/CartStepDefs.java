package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartStepDefs {

    public static final String ITEM = "Item";
    public static final String QUANTITY = "Quantity";
    public static final String PRICE = "Price";

    private List<Map<String, String>> cart;
    Double total;

    @Given("I have the following items in my cart")
//    public void i_have_the_following_items_in_my_cart(io.cucumber.datatable.DataTable dataTable) {
    public void i_have_the_following_items_in_my_cart(List<Map<String,String>> cart) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        this.cart = cart;
    }
    @When("I check out")
    public void i_check_out() {
        // Our cart table:
        // | Item        | Part No | Color | Quantity | Price |
        // | iPhone 6S   | 123654  | White | 1        | 899  |
        // | iPhone case | 756322  | Black | 1        | 24   |
        // | Car Charger | 658741  | Black | 3        | 9.95 |

        System.out.println("Cart items:");
        this.total = 0D;
        for (Map<String,String> rowMap : cart) {
            // Each row in the table is a map column headings and values
            String item = rowMap.get(ITEM);
            Integer quantity = Integer.parseInt(rowMap.get(QUANTITY));
            Double price = Double.parseDouble(rowMap.get(PRICE));

            double rowTotal = quantity * price;
            System.out.printf("\t %s: %s  %s: %d  %s: %.2f  %s: %.2f%n", ITEM, item, QUANTITY, quantity, PRICE, price, "Row Total", rowTotal);
            this.total += rowTotal;
        }
    }

    @Then("I will be charged {double}")
    public void i_will_be_charged_$(Double expectedTotal) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(expectedTotal, this.total);
    }

}
