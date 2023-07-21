package Domen;

import java.util.List;

public class AverageAge <T extends Person>{

    public double calculator(List<T> users){
        double sum = 0;
        for (T user : users) {
            sum+=user.getAge();
            
        }
        return sum/users.size();
        
    }
    
}
