package com.dao;


import java.util.List;

public interface CrudRepository<Model,ID> {

    public void add(Model model);
    public void removeById(ID id);
    public  void remove(Model model);
    public Model update(Model model);
    public Model findById(ID id);
    public List<Model> findAll();

}
