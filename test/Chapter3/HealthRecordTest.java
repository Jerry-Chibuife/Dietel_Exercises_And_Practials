package Chapter3;

import Chapter3.Exercise.HealthProfile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HealthRecordTest {
    HealthProfile patient;

    @BeforeEach
    public void beforeEachTest(){
        patient = new HealthProfile();
    }


    @Test
    public void iCanSetPatientFirstName(){

    }
}
