package com.marvellousinfosystem.second.service;

import com.marvellousinfosystem.second.Entity.BatchEntry;
import com.marvellousinfosystem.second.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
  @Autowired
  private BatchEntryRepository batchEntryRepository;

  //C :Create
  // POST
  public void saveEntry(BatchEntry batchEntry)
  {
      batchEntryRepository.save(batchEntry);
  }
  //R :Read
  //GET
  public List<BatchEntry>getAll()
  {
    return batchEntryRepository.findAll();
  }

  public Optional<BatchEntry> findById(ObjectId id)
  {
    return batchEntryRepository.findById(id);
  }
  //D :Delete
  //DELETE
  public void deleteById(ObjectId id)
  {
    batchEntryRepository.deleteById(id);
  }

 //sir
//  public void updateById(ObjectId id)
//  {
//
//  }

//  public String updateById(ObjectId id, BatchEntry updatedEntry) {
//    Optional<BatchEntry> existingOptional = batchEntryRepository.findById(id);
//
//    if (existingOptional.isPresent()) {
//      BatchEntry existing = existingOptional.get();
//
//
//      existing.setName(updatedEntry.getName());
//
//      batchEntryRepository.save(existing);
//      return "Entry updated successfully.";
//    } else {
//      return "Entry not found.";
//    }
//  }



}
