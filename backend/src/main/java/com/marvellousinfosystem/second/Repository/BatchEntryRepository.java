package com.marvellousinfosystem.second.Repository;

import com.marvellousinfosystem.second.Entity.BatchEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, ObjectId>
{

}
