package org.example.Fligth.Servis;

import org.example.Fligth.Mapper.MapperFlight;
import org.example.Fligth.Model.Dto.FligthDto.Request;
import org.example.Fligth.Model.Dto.FligthDto.Responce;
import org.example.Fligth.Model.Entity.Fligth;
import org.example.Fligth.Repo.FligthMySQLRepoImpl;
import org.example.Fligth.Repo.FligthRepo;
//import org.example.Fligth.Model.Entity.Figth;

import java.util.List;

public class FligthServis {
    private final MapperFlight mapperFlight = new MapperFlight();
    private final FligthRepo fligthRepo = FligthMySQLRepoImpl.getInstance();

    public List<Responce> view() {
        List<Fligth>fligths = fligthRepo.view();
        return mapperFlight.toViewResponceList(fligths);
    }


    public void add(Request request) {

        Fligth fligth = mapperFlight.toADDFligth(request);
        fligthRepo.add(fligth);
    }
    public void remove(Request request) {
        Fligth fligth = mapperFlight.toRemove(request);
          fligthRepo.remove(fligth);
    }
    public void update(Request request) {
        Fligth fligth = mapperFlight.toUpdate(request);
        fligthRepo.update(fligth);
    }
}

