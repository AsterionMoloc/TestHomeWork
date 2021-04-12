import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TstHomeWork {


    @Test
    public void TstForm() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("zxc");
        sleep(2000);
        $("#lastName").setValue("zxc");
        sleep(2000);
        $("#userEmail").setValue("zxc@zxc.com");
        sleep(2000);
        $x("//label[contains(text(),'Male')]").click();
        sleep(2000);
        $("#userNumber").setValue("1231231231");
        sleep(2000);
        $("#dateOfBirthInput").click();
        sleep(2000);
        $x("//*[@class='react-datepicker__month-select']/option [1]").click();
        sleep(2000);
        $x("//*[@class='react-datepicker__year-select']/option [101]").click();
        sleep(2000);
        $x("//*[@class='react-datepicker__day react-datepicker__day--001 react-datepicker__day--weekend']").click();
        sleep(2000);
        $x("//input[@id = 'subjectsInput']").setValue("Hin");
        sleep(2000);
        $x("//*[text()='Hindi']").click();
        sleep(2000);
        $x("//label[contains(text(),'Reading')]").click();
        sleep(2000);
        $x("//input[@id='uploadPicture']").uploadFromClasspath("img/Tst.png");
        sleep(2000);
        $x("//*[@id='currentAddress']").setValue("zxczxc");
        sleep(2000);
        $x("//*[@id='react-select-3-input']").click();
        sleep(2000);
        $x("//*[text()='Haryana']").click();
        sleep(2000);
        $x("//*[@id='react-select-4-input']").click();
        sleep(2000);
        $x("//*[text()='Panipat']").click();
        sleep(2000);
        $x("//*[@id='submit']").click();
        sleep(2000);
        $x("//*[@id='closeLargeModal']").click();
        sleep(2000);

    }
}
