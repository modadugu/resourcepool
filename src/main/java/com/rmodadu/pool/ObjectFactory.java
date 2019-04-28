package com.rmodadu.pool;


/**
 * Represents the mechanism to create 
 * new objects to be used in an object pool.
 * 
 * @author rmodadu
 *
 * @param < T > the type of object to create. 
 */
public interface ObjectFactory < T >
{
 /**
  * Returns a new instance of an object of type T.
  * 
  * @return T an new instance of the object of type T
  */
 public abstract T createNew();
}
