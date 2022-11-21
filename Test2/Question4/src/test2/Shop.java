package test2;

import java.util.ArrayList;
import java.util.List;

public class Shop {

public static void main(String[] args) {
List<Book>arrayList=new ArrayList<Book>();
arrayList.add(new Book ("ONE","rohith",800,"Novel"));
arrayList.add(new Book ("TWO","rakesh",200,"Magazines"));
arrayList.add(new Book ("THREE","rachith",700,"Journals"));
for(Book b:arrayList)
{
if(b.getGenre()=="Novel")
{
double price=b.getPrice();
price=price-(price*0.15);
System.out.println("Price for novel is: "+price);
}
else if(b.getGenre()=="Magazines")
{
double price=b.getPrice();
price=price-(price*0.20);
System.out.println("Price for Magazine is: "+price);
}
else if(b.getGenre()=="Journals")
{
double price=b.getPrice();
price=price-(price*0.25);
System.out.println("Price for Journal is: "+price);
}
}

}

}