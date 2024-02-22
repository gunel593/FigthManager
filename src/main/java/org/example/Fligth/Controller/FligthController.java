package org.example.Fligth.Controller;

import org.example.Fligth.Model.Dto.FligthDto.Request;
import org.example.Fligth.Model.Dto.FligthDto.Responce;
import org.example.Fligth.Servis.FligthServis;

import java.util.List;

public class FligthController {
    private  final FligthServis fligthServis= new FligthServis();
    public void Add(Request addrequest){
        fligthServis.add(addrequest);
    }

    public void RemoveFligth(Request removerequest){
        fligthServis.remove(removerequest);
    }
    public void UpdateFligth(Request updaterequest){
        fligthServis.update(updaterequest);
    }
    public List<Responce> ViewFligth(){
      return fligthServis.view();
    }
    }


