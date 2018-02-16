package by.itacademy.jd1.web.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import by.itacademy.jd1.web.dao.IBrandDao;
import by.itacademy.jd1.web.dao.ICarDao;
import by.itacademy.jd1.web.model.Brand;
import by.itacademy.jd1.web.model.Car;

public class CarDaoImpl extends AbstractDao<Car> implements ICarDao {

public static final ICarDao INSTANCE = new CarDaoImpl();
	
	private CarDaoImpl() {
		super();
	
	}
	
	@Override
	protected Car handleRow(ResultSet resultSet) throws SQLException {
		Car object = new Car();
		object.setId(resultSet.getInt("id"));
		object.setYear(resultSet.getInt("year"));
		object.setModelId(resultSet.getInt("model_id"));
		object.setEngineType(resultSet.getString("engine_type"));
		return object;
	}

	@Override
	protected String getTableName() {
		return "car";
	}

	@Override
	public Integer insert(Car object) throws SQLException {
		throw new RuntimeException("not implemented");
		
	}
}
