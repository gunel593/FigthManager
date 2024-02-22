package org.example.Fligth.Repo;

import org.example.Fligth.Model.Entity.Fligth;

import java.util.List;

public interface FligthRepo {
    List<Fligth>  view();
    void add(Fligth fligt);
    boolean update(Fligth fligth);
    void remove(Fligth fligth  );


}
