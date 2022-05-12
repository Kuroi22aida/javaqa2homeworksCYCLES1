import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;


public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void calculationGivenGRange() {
        SQRService service = new SQRService();

        int from = 300;
        int before = 3000;
        int expected = 37;

        int actual = service.calculateSquares(from, before);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void calculationGivenGRange2() {
        SQRService service = new SQRService();

        int from = 500;
        int before = 6000;
        int expected = 55;

        int actual = service.calculateSquares(from, before);

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void calculationGivenGRange3() {
        SQRService service = new SQRService();

        int from = 400;
        int before = 600;
        int expected = 5;

        int actual = service.calculateSquares(from, before);

        assertEquals(expected, actual);

    }
}