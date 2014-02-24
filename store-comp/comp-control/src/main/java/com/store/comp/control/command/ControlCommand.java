package com.store.comp.control.command;


import org.springframework.context.ApplicationEvent;

import com.store.comp.control.event.CacheReloadEvent;
import com.store.comp.control.event.ReschedulingEvent;


public enum ControlCommand {


   CacheReload(
      new CacheReloadEvent(null)),

   Rescheduling(
      new ReschedulingEvent(null));

   private ApplicationEvent event;


   ControlCommand(ApplicationEvent event){
      this.event = event;
   }

   public ApplicationEvent getEvent() {
      return event;
   }
}