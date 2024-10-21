import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        int indexDeAtaque;
        // Lista para armazenar os castelos
        List<Castelo> castelos = new ArrayList<>();

        // Criar 2 castelos japoneses
        Japones casteloJapones1 = new Japones(2, 2, "Castelo Japones 1" , 15);
        Japones casteloJapones2 = new Japones(2, 2, "Castelo Japones 2" , 15);


        // Criar 2 castelos europeus
        Europeu casteloEuropeu1 = new Europeu(3, 2, "Castelo Europeu 1", 10);
        Europeu casteloEuropeu2 = new Europeu(3, 2, "Castelo Europeu 2", 10);

        // Adicionar os castelos à lista
        castelos.add(casteloJapones1);
        castelos.add(casteloJapones2);
        castelos.add(casteloEuropeu1);
        castelos.add(casteloEuropeu2);
        


        menu(castelos);
        while (true) {
            for(int i = 0; i < castelos.size(); i++){
                switch (i) {
                    case 0:
                        System.out.println("É A VEZ DE: Castelo Japones 1");
                        System.out.print("1- Castelo Japones 2\n" +
                                         "2- Castelo Europeu 1\n" +
                                         "3- Castelo Europeu 2\n");
                        indexDeAtaque = Input.inputInt("Informe o castelo que deseja atacar: ");
                        atacarCastelo(castelos, indexDeAtaque);                
                        break;
    
                    case 1:
                        System.out.println("É A VEZ DE: Castelo Japones 2");
                        System.out.print("0- Castelo Japones 1\n" +
                                         "2- Castelo Europeu 2\n" +
                                         "3- Castelo Europeu 3\n");
                        indexDeAtaque = Input.inputInt("Informe o castelo que deseja atacar: ");
                        atacarCastelo(castelos, indexDeAtaque);                    
                        break;
    
                    case 2:
                        System.out.println("É A VEZ DE: Castelo Europeu 1");
                        System.out.print("0- Castelo Japones 1\n" +
                                         "1- Castelo Japones 2\n" +
                                         "3- Castelo Europeu 2\n");
                        indexDeAtaque = Input.inputInt("Informe o castelo que deseja atacar: ");
                        atacarCastelo(castelos, indexDeAtaque);
                        break;
    
                    case 3:
                        System.out.println("É A VEZ DE: Castelo Europeu 2");
                        System.out.print("0- Castelo Japones 1\n" +
                                         "1- Castelo Castelo Japones 2 \n" +
                                         "2- Castelo Europeu 1\n");
                        indexDeAtaque = Input.inputInt("Informe o castelo que deseja atacar: ");
                        atacarCastelo(castelos, indexDeAtaque);                   
                        break;
                
                    default:
                        break;
                }
            }

            if(castelos.size() == 1){
                System.out.println("O jogo acabou");                
                System.out.println("O castelo vencedor é: " + castelos.get(0).getNome());
                castelos.clear();
                break;
            }
        }     
    }        
    

    public static void menu(List<Castelo> castelos){
        for(Castelo castelo : castelos){
            System.out.println("Nome: " + castelo.getNome());
            System.out.println("Pontos de vida: " + castelo.getPontosDeVida());
            System.out.println("Defesa: " + castelo.getDefesa());

            if(castelo instanceof Japones){
                System.out.println("Nº de Samurais: " + ((Japones) castelo).getNumSamurai());
            }else{
                System.out.println("Nº de Paladinos: " + ((Europeu) castelo).getNumPaladino());
            }

            System.out.println("====================================");
        }
        System.out.println();
        System.out.println();
    }

    public static void atacarCastelo(List<Castelo> castelos, int indexDeAtaque) {    
        // Verifica se o índice é válido antes de continuar
        if (indexDeAtaque >= 0 && indexDeAtaque < castelos.size()) {
            Castelo castelo = castelos.get(indexDeAtaque);
    
            // Gera um valor aleatório para o ataque
            int dano = (int) (Math.random() * 10 + 1);
            System.out.println("Dano causado: " + dano);
    
            // Verifica o tipo de castelo e realiza o ataque correspondente
            if (castelo instanceof Europeu) {
                ((Europeu) castelo).ataque(dano);
                System.out.println(((Europeu) castelo).situacao());
                System.out.println("====================================");
                if(((Europeu) castelo).getPontosDeVida() == 0){
                    System.out.println("O castelo foi destruído");
                    castelos.remove(castelo);
                }
            } else if (castelo instanceof Japones) {
                ((Japones) castelo).ataque(dano);
                 System.out.println(((Japones) castelo).situacao());
                 System.out.println("====================================");

                    if(((Japones) castelo).getPontosDeVida() == 0){
                        System.out.println("O castelo foi destruído");
                        castelos.remove(castelo);
                    }
            } else {
                System.out.println("Tipo de castelo desconhecido.");
            }
        } else {
            System.out.println("Índice inválido.");
        }
    }
}