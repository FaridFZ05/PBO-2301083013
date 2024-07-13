/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_06_08_24;

import java.util.ArrayList;
import java.util.List;

public class BukuDao {
    private List<Buku> data = new ArrayList();
    
    public BukuDao() {
        data.add(new Buku("B001", "Dungeon Messi", "Farid", "Plex Media", "2069"));
        data.add(new Buku("B002", "Fikram The Slayer", "Aceng", "Kramedia", "1969"));
    }
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getAnggota(int index){
        return data.get(index);
    }
    public List<Buku> getAll(){
        return data;
    }

    Buku getBuku(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
