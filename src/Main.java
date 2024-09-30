import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    final private List<Flora> allFloras = new ArrayList<>();

    public Main(){
        // Här är exempel av polymorphism då olika typer av växter alla läggs in i ett Flora objekt.
        Flora igge = new Cactus(20,"Igge");
        Flora laura = new PalmTree(500, "Laura");
        Flora meatloaf = new CarnivorousPlant(70, "Meatloaf");
        Flora olof = new PalmTree(100, "Olof");

        allFloras.add(igge);
        allFloras.add(laura);
        allFloras.add(meatloaf);
        allFloras.add(olof);
        MainLoop();
    }

    private void MainLoop(){
        while(true){
            String userInput = getUserInput();
            if (userInput == null || userInput.equalsIgnoreCase("q")){
                break;
            }
            if (userInput.equalsIgnoreCase("a")){
                printAllFloras();
            } else {
                printFloraByName(userInput);
            }
        }
    }

    private String getUserInput(){
        return JOptionPane.showInputDialog(null,
                "Which flora do you want water info on?\nA = Get all names in the system\nQ = Exit");
    }

    private void printFloraByName(String name){
        boolean floraFound = false;
        for (Flora f : allFloras){
            if (f.getName().equalsIgnoreCase(name)){
                f.printWaterNeeded();
                floraFound = true;
            }
        }
        if (!floraFound){
            JOptionPane.showMessageDialog(null,
                    "There is no flora with the name " + name + ".");
        }
    }

    private void printAllFloras(){
        StringBuilder prompt = new StringBuilder("The floras in the system are:\n");
        for (Flora f : allFloras){
            prompt.append(f.getName()).append(", ");
        }
        prompt.setLength(prompt.length() - 2);
        prompt.append(".");
        if (allFloras.isEmpty()){
            prompt = new StringBuilder("There are no floras currently in the system.");
        }
        JOptionPane.showMessageDialog(null, prompt);
    }

    public static void main(String[] args) {
        Main _ = new Main();
    }
}
