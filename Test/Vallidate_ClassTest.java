import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vallidate_ClassTest {
    Vallidate_Class vallidate_class;
    @BeforeEach
    void setup(){
        vallidate_class = new Vallidate_Class();
    }

    @Test
    void vallidate1() {
        String phone = "(84)-(0978489648)";
        boolean expect = true;
        boolean result = vallidate_class.vallidate(phone);
        assertEquals(expect, result);
    }
    @Test
    void vallidate2() {
        String phone = "(a8)-(22222222)";
        boolean expect = false;
        boolean result = vallidate_class.vallidate(phone);
        assertEquals(expect, result);
    }
    @Test
    void vallidate3() {
        String phone = "(a8)-(0793031666)";
        boolean expect = false;
        boolean result = vallidate_class.vallidate(phone);
        assertEquals(expect, result);
    }
    @Test
    void vallidate4() {
        String phone = "(78)-(0793031999)";
        boolean expect = true;
        boolean result = vallidate_class.vallidate(phone);
        assertEquals(expect, result);
    }
    @Test
    void vallidate5() {
        String phone = "(78)-(07930319b9)";
        boolean expect = false;
        boolean result = vallidate_class.vallidate(phone);
        assertEquals(expect, result);
    }
}