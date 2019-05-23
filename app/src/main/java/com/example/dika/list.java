package com.example.dika;
/** Created on 5/21/2019 by Andika IF7
 */
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

public class list extends Fragment {
    View v ;
    public list() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.list_fragment,container,false);
        return v ;
    }

    public class listTeman {
        private LinkedList<Teman> list;
        public listTeman(){
            list = new LinkedList<>();
        }
        public boolean add(Teman teman){
            if (list.add(teman)){
                Log.d("tag","Teman '"+teman.getNim()+"' berhasil ditambah!");
                return true;
            }
            else{
                Log.d("tag","Teman '"+teman.getNim()+"' gagal ditambah!");
                return false;
            }
        }
        public boolean delete(Teman teman){
            if(list.remove(teman)){
                Log.d("tag","Teman = "+teman.getNim()+" Berhasil di dihapus");
                return true;
            }
            else{
                Log.d("tag","Teman = "+teman.getNim()+" gagal di dihapus");
                return false;
            }
        }
        public boolean modify(Teman x,Teman y){
            if(list.contains(x)){
                int index = list.indexOf(x);
                Teman t = (Teman)list.set(index, y);
                Log.d("tag","List "+ t.getNim()+" berhasil diubah");
                return true;
            }
            else{
                Log.d("tag","List gagal diubah");
                return false;
            }
        }
        public Teman getLast(){
            return (Teman) list.getLast();
        }

        public Teman[] getAll(){
            Teman[] teman = new Teman[list.size()];
            return list.toArray(teman);
        }
    }
}
