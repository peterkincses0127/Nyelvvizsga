import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Nyelvek {

    private ArrayList<Nyelv> sikeresnyelvArrayList= new ArrayList<>();
    private ArrayList<Nyelv> sikertelennyelvArrayList= new ArrayList<>();
    private void Beolvas(){
        try {
            FileReader fr = new FileReader("sikeres.csv");
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            br.readLine();
            while(sor!=null) {
                String[] st = sor.split(";");
                String nyelv = st[0];
                int kilenc = Integer.parseInt(st[1]);
                int tiz = Integer.parseInt(st[2]);
                int tizenegy = Integer.parseInt(st[3]);
                int tizenketto= Integer.parseInt(st[4]);
                int tizenharom = Integer.parseInt(st[5]);
                int tizennegy = Integer.parseInt(st[6]);
                int tizenot = Integer.parseInt(st[7]);
                int tizenhat = Integer.parseInt(st[8]);
                int tizenhet= Integer.parseInt(st[9]);
                sikeresnyelvArrayList.add(new Nyelv(nyelv, kilenc, tiz , tizenegy,tizenketto,tizenharom,tizennegy,tizenot,tizenhat,tizenhet));

                FileReader fr2 = new FileReader("sikertelen.csv");
                BufferedReader br2 = new BufferedReader(fr);
                String sor2 = br.readLine();
                br.readLine();
                while (sor != null) {
                    String[] st2 = sor.split(";");
                    String nyelv2 = st[0];
                    int kilenc2 = Integer.parseInt(st[1]);
                    int tiz2 = Integer.parseInt(st[2]);
                    int tizenegy2 = Integer.parseInt(st[3]);
                    int tizenketto2= Integer.parseInt(st[4]);
                    int tizenharom2 = Integer.parseInt(st[5]);
                    int tizennegy2 = Integer.parseInt(st[6]);
                    int tizenot2 = Integer.parseInt(st[7]);
                    int tizenhat2 = Integer.parseInt(st[8]);
                    int tizenhet2= Integer.parseInt(st[9]);
                    sikertelennyelvArrayList.add(new Nyelv(nyelv2, kilenc2, tiz2 , tizenegy2,tizenketto2,tizenharom2,tizennegy2,tizenot2,tizenhat2,tizenhet2));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void MasodikFeladat(){
        for (Nyelv ny: sikeresnyelvArrayList
             ) {
            System.out.println(ny.getNyelv());
        }
    }
    public void Feladatok(){
        Beolvas();
        MasodikFeladat();
  }
}
