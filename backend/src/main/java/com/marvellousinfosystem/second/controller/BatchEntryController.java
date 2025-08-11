package com.marvellousinfosystem.second.controller;

import com.marvellousinfosystem.second.Entity.BatchEntry;
import com.marvellousinfosystem.second.service.BatchEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
  @Autowired
  private BatchEntryService batchEntryService;

  @GetMapping
   public ResponseEntity<?> getAll()
  //return value mahit nahi manun ?
  {
    List<BatchEntry> allData =batchEntryService.getAll();

    if((allData!=null) && !allData.isEmpty())
    {
      return new ResponseEntity<>(allData, HttpStatus.OK);
    }
    else
    {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping
    public ResponseEntity<BatchEntry> createEntry(@RequestBody BatchEntry myentry)
  {
    try
    {
      batchEntryService.saveEntry(myentry);
      return new ResponseEntity<BatchEntry>(myentry,HttpStatus.CREATED);
    }
    catch (Exception eobj)
    {
      return  new ResponseEntity<BatchEntry>(HttpStatus.BAD_REQUEST);
    }
  }

//  @GetMapping("/id/{myid}")
//    public Optional<BatchEntry> getBatchEntryById(@PathVariable ObjectId myid)
//  {
//    return batchEntryService.findById(myid);
//  }

  //OR
  @GetMapping("/id/{myid}")
  public ResponseEntity<BatchEntry> getBatchEntryById(@PathVariable ObjectId myid)
  {

       Optional<BatchEntry> batchEntry=batchEntryService.findById(myid);
       if(batchEntry.isPresent())
       {
         return new ResponseEntity<BatchEntry>(batchEntry.get(),HttpStatus.OK);
       }
       else
       {
          return new ResponseEntity<BatchEntry>(HttpStatus.NOT_FOUND);
       }
  }

  @DeleteMapping("/id/{myid}")
    public ResponseEntity<?> deleteEntryByID(@PathVariable ObjectId myid)
  {
    batchEntryService.deleteById(myid);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  //sir
  @PutMapping("/id/{myid}")
    public ResponseEntity<?>UpdateEntryByID(@PathVariable ObjectId myid,@RequestBody BatchEntry myentry)
  {
    BatchEntry old=batchEntryService.findById(myid).orElse(null);
    if(old!=null)
    {
      old.setName(myentry.getName());
      old.setFees(myentry.getFees());

      batchEntryService.saveEntry(old);
      return new ResponseEntity<>(old,HttpStatus.OK);
    }
    else
    {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

//  @PutMapping("/id/{myid}")
//  public String  UpdateEntryByID(@PathVariable ObjectId myid,@RequestBody BatchEntry myentry)
//  {
//    return batchEntryService.updateById(myid, myentry);
//  }

}
