import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TstHomeWork {


    @Test
    void TstForm() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("zxc");
        sleep(2000);
        $("#lastName").setValue("zxc");
        sleep(2000);
        $("#userEmail").setValue("zxc@zxc.com");
        sleep(2000);
        $x("//*[@id='genterWrapper']/div[2]/div[1]/label").click();
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
        $x("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label").click();
        sleep(2000);
        $x("//input[@id='uploadPicture']").uploadFromClasspath("img/Tst.png");
        sleep(2000);
        $x("//*[@id=\"currentAddress\"]").setValue("zxczxc");
        sleep(2000);
        $x("//*[@id=\"state\"]/div/div[2]").click();
        sleep(2000);
        $x("//*[text()='Haryana']").click();
        sleep(2000);
        $x("//*[@id=\"city\"]/div/div[1]/div[1]").click();
        sleep(2000);
        $x("//*[text()='Karnal']").click();
        sleep(2000);
        $x("//*[@id=\"submit\"]").click();
        sleep(2000);
        $x("//*[@id=\"closeLargeModal\"]").click();
        sleep(2000);

    }
}
