package model.excersize;

import model.exceptions.ExcersizeFactoryException;

public interface IExcersizeFactory {
    public BaseExcersize create(String excersizeInfo) throws ExcersizeFactoryException;
}
