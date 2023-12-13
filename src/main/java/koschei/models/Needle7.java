package koschei.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    // Связывание через сканирование(поиск) бина по типу.
    @Autowired
    private Deth8 deth8;


    @Override
    public String toString() {

        return ", смерть Кощея на игле :( " + deth8.toString();
    }
}
