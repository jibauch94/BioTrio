/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Hall;
import model.Showing;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Simon_
 */
public class HallController {

    private ArrayList<Hall> halls;
    private Hall hallItem;

    public HallController() {
        halls = new ArrayList<>();
        queryHall();
    }

    public void queryHall() {
        String query = "select * from hall";
        try {
            DB_Connection.getCon();
            DB_Connection.setStmt(DB_Connection.getCon().createStatement());
            DB_Connection.setRs(DB_Connection.getStmt().executeQuery(query));

            ArrayList<Hall> dataList = new ArrayList<>();

            while (DB_Connection.getRs().next()) {

                String name = DB_Connection.getRs().getString("name");
                int rowcount = DB_Connection.getRs().getInt("rowcount");
                int rowlength = DB_Connection.getRs().getInt("rowlength");
                int hall_id = DB_Connection.getRs().getInt("hall_id");
                int totalSeats = DB_Connection.getRs().getInt("totalSeats");
                hallItem = new Hall(name, rowlength, rowcount, hall_id, totalSeats);
                dataList.add(hallItem);
            }
            halls = dataList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Hall> getHalls() {
        return halls;
    }

    public void setHalls(ArrayList<Hall> halls) {
        this.halls = halls;
    }

    public ArrayList<Hall> getHallByShowing(Showing showing) {
        ArrayList<Hall> data = new ArrayList<>();
        for (Hall hall : halls) {
            if (showing.getHall().getHallId() == hall.getHallId()) {
                data.add(hall);
            }
        }
        return data;
    }

    public Hall getHallById(int id) {
        Hall result = null;
        for (Hall hall : halls) {
            if (id == hall.getHallId()) {
                result = hall;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return hallItem.getHallName();
    }

}
