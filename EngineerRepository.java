package com.xworkz.engineer.repository;

import com.xworkz.engineer.app.dto.EngineerDTO;

public interface EngineerRepository {
	void save(EngineerDTO dto);
	int TOTAL_ITMES=10;
	default boolean isExist(EngineerDTO dto) {
		return false;
	}
	default EngineerDTO findByID(int id)
	{
		return null;
	}
	default EngineerDTO findByNAME(String name)
	{
		return null;
	}
	default EngineerDTO findByCOLLEGENAME(String collegName)
	{
		return null;
	}
	

}
