package service;

import domain.FuXue;

import java.util.List;

public interface FuXueService {

    void applyFuXue(FuXue fuXue);

    void shenhe(FuXue fuXue);

    List<FuXue> getAll(int tno);

    List<FuXue> get(int fxno);

    FuXue getSingle(int fxno);

    void delete(int fxno);
}
