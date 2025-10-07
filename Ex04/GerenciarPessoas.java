import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciarPessoas {
    
    private Map<String, Integer> pessoas;
    
    public GerenciarPessoas() {
       this.pessoas = new HashMap<>();
    }

    public void addPeople(String name, int age) {
        pessoas.put(name, age);
    }
    public void consultAgeByName (String name) {
        int age1 = pessoas.get(name);
        System.out.println("A pessoa " + name + " tem " + age1 + " anos");
    }

    public void listNamesByAge(int age) {
        for(Map.Entry<String, Integer> entry : pessoas.entrySet() ) {
            if(entry.getValue() == age) {
                System.out.println(entry.getKey());
            }
        }
    }
}
