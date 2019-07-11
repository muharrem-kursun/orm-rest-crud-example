package com.service;


import com.model.Person;

import java.util.List;

public interface CrudService<Model,ID> {

    public void add( Model model);
    public void removeById(ID id);
    public  void remove(Model model);
    public Model update(Model model);
    public Model findById(ID id);
    public List<Model> findAll();

}
