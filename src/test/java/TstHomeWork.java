import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TstHomeWork {


    @Test
    void TstForm() {
    open ("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("zxc");
        $("#lastName").setValue("zxc");
        $("#userEmail").setValue("zxc@zxc.com");
        $x("//*[@id='genterWrapper']/div[2]/div[1]/label").click();
        $("#userNumber").setValue("1231231231");
        $("#dateOfBirthInput").click();
        $x("//*[@class='react-datepicker__month-select']/option [1]").click();
        $x("//*[@class='react-datepicker__year-select']/option [101]").click();
        $x("//*[@class='react-datepicker__day react-datepicker__day--001 react-datepicker__day--weekend']").click();
        $x("//input[@id = 'subjectsInput']").setValue("Hin");
        $x("//*[text()='Hindi']").click();
        $x("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label").click();
        $x("//input[@id='uploadPicture']").uploadFromClasspath("img/Tst.png");
        $x("//*[@id=\"currentAddress\"]").setValue("zxczxc");
        $x("//*[@id=\"state\"]/div/div[2]").click();
        $x("//*[text()='Haryana']").click();
        $x("//*[@id=\"city\"]/div/div[1]/div[1]").click();
        $x("//*[text()='Karnal']").click();
        $x("//*[@id=\"submit\"]").click();
        sleep(7000);
        $x("//*[@id=\"closeLargeModal\"]").click();
        sleep(7000);



        //$("id=\"currentAddress\"").setValue("zxczxc");


        sleep(1000);





        // userEmail
                //userNumber

    }
}
