package Monangis;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Johanna
 */
public class MainClass {
    public static void main(String[] args) {
        //int n = 1;
        //Buku perpustakaan[] = new Buku[n]; //the entire shelf
        ArrayList<Buku> perpustakaan = new ArrayList<Buku>();
        
/////////////////////////////// DECIDING TYPE ///////////////////////////////        
        //for the first 3 existing books
        Random ran = new Random();
        int coinflipbook1 = ran.nextInt(2);
        
        if(coinflipbook1 == 0)
                perpustakaan.add(new Buku("Pramoedya","Bumi Manusia",100,"Fiksi"));
        if(coinflipbook1 == 1)
                perpustakaan.add(new Buku("Pramoedya","Bumi Manusia",100,"Non-Fiksi"));
        int coinflipbook2 = ran.nextInt(2);
        if(coinflipbook2 == 0)
                perpustakaan.add(new Buku("Pramoedya","Bukan Pasar Malam",200,"Fiksi"));
        if(coinflipbook2 == 1)
                perpustakaan.add(new Buku("Pramoedya","Bukan Pasar Malam",300,"Non-Fiksi"));
        int coinflipbook3 = ran.nextInt(2);
        if(coinflipbook3 == 0)
                perpustakaan.add(new Buku("Pramoedya","Anak Semua Bangsa",300,"Fiksi"));
        if(coinflipbook3 == 1)
                perpustakaan.add(new Buku("Pramoedya","Anak Semua Bangsa",300,"Non-Fiksi"));
//        //for the next books after the 3rd one
//        for (int i=3; i<perpustakaan.size(); i++){
//            int coinflip = ran.nextInt(2);
//            if(coinflip == 1){
//                perpustakaan.get(i).setBooktype("Fiksi");}
//            else{
//                perpustakaan.get(i).setBooktype("Non-Fiksi");}
//        }
/////////////////////////////// COUNTING AREA ///////////////////////////////
        //FICTION BOOKS
        Berhitung count = new Berhitung();
        int sumfpages = 1; int nfiction = 1; double sdf = 1;
        for(int i=0;i<perpustakaan.size();i++){
            if(perpustakaan.get(i).getBooktype()=="Fiksi"){
                count.setSumfpages(sumfpages += perpustakaan.get(i).getPages());
                count.setNfiction(nfiction++);
                count.setSdf(sdf += Math.pow((perpustakaan.get(i).getPages() - count.getRata2f()),2) / perpustakaan.size());
            }
        }

        //NON-FICTION BOOKS
        Berhitung count2 = new Berhitung();
        for(int i=0;i<perpustakaan.size();i++){
            if(perpustakaan.get(i).getBooktype()=="Non-Fiksi"){
                count2.setSumfpages(sumfpages += perpustakaan.get(i).getPages());
                count2.setNfiction(nfiction++);
                count2.setSdf(sdf += Math.pow((perpustakaan.get(i).getPages() - count2.getRata2f()),2) / perpustakaan.size());
            }
        }
        //ALL BOOKS
        Berhitung count3 = new Berhitung();
        for(int i=0;i<perpustakaan.size();i++){
            count3.setSumfpages(sumfpages += perpustakaan.get(i).getPages());
            count3.setNfiction(nfiction++);
            count3.setSdf(sdf += (Math.pow((perpustakaan.get(i).getPages() - count3.getRata2f()),2) / perpustakaan.size()));
        }
        
/////////////////////////////// PRINTING AREA ///////////////////////////////
        System.out.println("PERPUSTAKAAN HEADER\n====\n[1]. input buku baru\n[2]. modifikasi detail buku\n[3]. hapus buku\n[0]. EXIT");
        System.out.println("====\nJumlah buku: "+count3.getNfiction()+"\nRata-rata halaman buku: "+count3.getRata2f()+"\nStandar deviasi halaman buku: "+count3.getStanDevf());
        System.out.println("====\nJumlah buku Fiksi: "+count.getNfiction()+"\nRata-rata halaman buku Fiksi: "+count.getRata2f()+"\nStandar deviasi halaman buku Fiksi: "+count.getStanDevf());
        System.out.println("====\nJumlah buku Non-fiksi: "+count2.getNfiction()+"\nRata-rata halaman buku Non-fiksi: "+count2.getRata2f()+"\nStandar deviasi halaman buku Non-fiksi: "+count2.getStanDevf()+"\n====");
        System.out.print("Pilih Opsi: ");
/////////////////////////////// HUMAN REACTION ///////////////////////////////
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if(choice == 0){
            System.out.println("Thank you!");
        }
        if(choice == 1){
            System.out.println("====\nBUKU BARU\n====");
            System.out.println("input judul buku: ");
            String titlebaru = input.next();
            System.out.println("input pengarang buku: ");
            String authorbaru = input.next();
            System.out.println("input halaman buku: ");
            int pagesbaru = input.nextInt();
            System.out.println("'Fiksi'/'Non-Fiksi'? (Case sensitive): ");
            String jenisbaru = input.next();
            perpustakaan.add(new Buku(titlebaru, authorbaru, pagesbaru, jenisbaru));
            choice = 4;
        }
        if(choice == 2){
            System.out.println("HAPUS BUKU\n====");
            System.out.println("Pilih buku yang akan dihapus: ");
            for (int i=0; i<perpustakaan.size(); i++){
                System.out.println("\n["+ (i+1) + "]. "+perpustakaan.get(i).getTitle()+" | "+perpustakaan.get(i).getAuthor());
            }
            System.out.print("Pilih Opsi: ");
            int x = input.nextInt();
            perpustakaan.remove(x-1);
            choice = 1;
        }
        if(choice == 3){
            System.out.println("UBAH BUKU\n====");
            System.out.println("Pilih buku yang akan diubah: ");
            for (int i=0; i<perpustakaan.size(); i++){
                System.out.println("\n["+ (i+1) + "]. "+perpustakaan.get(i).getTitle()+" | "+perpustakaan.get(i).getAuthor());
            }
            System.out.print("Pilih Opsi: ");
            int y = input.nextInt();
            
            System.out.print("input judul buku yang baru:\n>");
            String titlebaru2 = input.nextLine();
            System.out.println("input pengarang buku yang baru:\n>");
            String authorbaru2 = input.nextLine();
            System.out.println("input halaman buku yang baru:\n>");
            int pagesbaru2 = input.nextInt();
            System.out.println("'Fiksi'/'Non-Fiksi'? (Case sensitive):\n>");
            String jenisbaru2 = input.nextLine();
            perpustakaan.set((y-1),new Buku(titlebaru2, authorbaru2, pagesbaru2, jenisbaru2));
        }
    }    
}
/////////////////////////////// SUBCLASSES /////////////////////////////// 
class Perpustakaan{ //to print homepage
    public void Welcome(){
        System.out.println("PERPUSTAKAAN HEADER\n====\n[1]. input buku baru\n[2]. modifikasi detail buku\n[3]. hapus buku\n[0]. EXIT");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
    }
}

class Buku extends Perpustakaan{ //as the object
    public int pages; //number of pages
    public String title;
    public String author;
    public String booktype;
    
    public Buku(){
        title = "Judul";
        author = "Nama";
        pages = 0;
        booktype = "Jenis";
    }
    public Buku(String title, String author, int pages, String booktype){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.booktype = booktype;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
    
}
class Berhitung extends Buku{
    public int nfiction; //sebenernya fot all i just used the wrong variable name lmao
    public int sumfpages;
    public double sdf;
    double Rata2f;
    double StanDevf;

    public int getNfiction() {
        return nfiction;
    }

    public int getSumfpages() {
        return sumfpages;
    }

    public double getSdf() {
        return sdf;
    }

    public double getRata2f() {
        return getSumfpages()/getNfiction();
    }

    public double getStanDevf() {
        return Math.sqrt(getSdf());
    }

    public void setNfiction(int nfiction) {
        this.nfiction = nfiction;
    }

    public void setSumfpages(int sumfpages) {
        this.sumfpages = sumfpages;
    }

    public void setSdf(double sdf) {
        this.sdf = sdf;
    }

    public void setRata2f(double Rata2f) {
        this.Rata2f = Rata2f;
    }

    public void setStanDevf(double StanDevf) {
        this.StanDevf = StanDevf;
    }
}