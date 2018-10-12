package service;

import domain.FuXue;

import java.util.List;

public interface FuXueService {

    void applyFuXue(FuXue fuXue);

    void shenhe(FuXue fuXue);

    List<FuXue> getAll();

    FuXue get(int fxno);

    void delete(int fxno);
}
