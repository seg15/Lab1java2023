package org.example;
import javax.swing.table.AbstractTableModel;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;


public class My extends AbstractTableModel  {
      private ArrayList<Car> carList = new ArrayList<>();

      My(){
          carList.add(new Car("Audi","R8",true,"Black"));
      }
 public String getColumName(int column){
          if (column==0) return "Brand";
          if(column == 1) return "Model";
          if(column==2) return "Transmision";
          if(column=3) return "Color";
          throw new IllegalAccessException();
 }

@Override
    public int getColumnCount(){
          return 2;
}

@Override
public int getRowCount(){
          return carList.size();
}
      @Override
    public Object getValueAt(int row, int column){
          Car car = carList.get(row);
          if(column==0 ) return car.getBrand();
          if(column==1) return car.getModel();
          if(column==2)  return car.getTransmision();
          if(column==3) return car.getColor();
          throw new IllegalAccessException();
      }


      void addCar(Car car){
          carList.add(car);
          fireTableDataChanged();
      }

       void save (Path path){
          JsonArray ja = new JsonArray();
          for ( Car car : carList){
              ja.add(car.toJsonObject());
          }

       String jsonText = Jsoner.serialize(ja);
           try{
               Files.write(path.jsonText.getBytes(), StandardOpenOption.CREATE);
           } catch (IOException e){
               throw new RuntimeException(e);
           }
       }
}

public static void main(String[] args){
    My();
}
