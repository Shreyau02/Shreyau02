import java.io.filewriter;
import java.io*;
class myfile writer;
   public static void main(String args[])
   {
   try{
   {
   filewriter fw=newfilewriter("Textfile txt")
   string s="\n All the best for your exams dear student\n";
   //to charArray()is method to convert a string in a character array
   char ch[]=s.tocharArray();
   for(int i=0;i<ch.length;i++)
   fw.write(ch[i]);
   s="Good Luck and prepare well:",fw.write(s);
      fw.close();
      int i=0;
      File reader fr=new Filereader("Test File1.txt");
      while (i=fr.read())!=-1)
      System.out.print((char))i);
      fr.close;
      }
      catch(FileNotFoundException nfe){
      System.out.println("Invalid FileName\nFiledoes not exists.");
      }
    }
}
