package entity;


/***
 * CREATE TABLE IF NOT EXISTS characters (
 *	id SERIAL PRIMARY KEY,
 *  name VARCHAR(30),
 *  type VARCHAR(30),
 *  size INTEGER(4),
 *  level INTEGER(3)
);
 */

public class Character {
	private int id;
	private String name;
	private int level;
	private int size;
	private String type;
}
