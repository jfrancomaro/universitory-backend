package com.universitory.service;

import java.util.List;

public interface GenericMapper<E,D> {

    E mapIn(D d);
    List<E> mapInList(List<D> d);
    D mapOut(E e);
    List<D> mapOutList(List<E> e);
}
