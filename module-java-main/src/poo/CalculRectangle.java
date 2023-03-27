package poo;

class CalculRectangle {
  public static double caculSurface(double longueur,double largeur){
      return longueur*largeur;
  }

    public static double caculPerimetre(double longueur,double largeur){
        return 2*(longueur+largeur);
    }

}


class MonProgramme{
    public static void main(String[] args) {
        double longueur=500;
        double largeur=250;

        System.out.println(CalculRectangle.caculPerimetre(longueur,largeur));
        System.out.println(CalculRectangle.caculSurface(longueur,largeur));
    }
}