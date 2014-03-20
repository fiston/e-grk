package com.rab.girinka.web;

import com.rab.girinka.models.*;
import com.rab.girinka.service.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
@RequestMapping(value="/admin", method = RequestMethod.GET)
public class ViewController {

    @Autowired
    private SourceService sourceService;
    @Autowired
    private BreedService breedService;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private BullService bullService;
    @Autowired
    private CowService cowService;
    @Autowired
    private GirinkaService girinkaService;
    @Autowired
    private InseminationService inseminationService;
    @Autowired
    private KwituraService kwituraService;
    @Autowired
    private LiveStockEventService liveStockEventService;
    @Autowired
    private LocationLevelService locationLevelService;
    @Autowired
    private LocationService locationService;
    @Autowired
    private ParityService parityService;
    @Autowired
    private PersonService personService;
    @Autowired
    private ProductionService productionService;
    @Autowired
    private ProgramService programService;


    @RequestMapping(value="/index", method = RequestMethod.GET)
    protected String viewIndex(){
        return "hello";
    }

    @RequestMapping(value="/source/add", method = RequestMethod.POST)
    protected String addSource(@ModelAttribute("source")
                                   Source source, BindingResult result)
            throws Exception {
        sourceService.saveSource(source);
        return "source";
    }

    @RequestMapping(value="/source/list", method = RequestMethod.GET)
    protected String viewSource(Map<String, Object> map){
        map.put("source", new Source());
        map.put("sourceList", sourceService.listSources());
        System.out.print(sourceService.listSources().size());

        return "source";
    }
    @RequestMapping(value="/user/add", method = RequestMethod.POST)
    protected String addUser(@ModelAttribute("user")
                               User user, BindingResult result)
            throws Exception {
        userService.saveUser(user);
        return "user";
    }

    @RequestMapping(value="/user/list", method = RequestMethod.GET)
    protected String viewUser(Map<String, Object> map){
        map.put("user", new User());
        map.put("userList", userService.listUsers());

        return "user";
    }
    @RequestMapping(value="/role/add", method = RequestMethod.POST)
    protected String addRole(@ModelAttribute("role")
                               Role role, BindingResult result)
            throws Exception {
        roleService.saveRole(role);
        return "role";
    }

    @RequestMapping(value="/role/list", method = RequestMethod.GET)
    protected String viewRole(Map<String, Object> map){
        map.put("role", new Role());
        map.put("roleList", roleService.listRoles());

        return "role";
    }
    @RequestMapping(value="/program/add", method = RequestMethod.POST)
    protected String addProgram(@ModelAttribute("program")
                               Program program, BindingResult result)
            throws Exception {
        programService.saveProgram(program);
        return "program";
    }

    @RequestMapping(value="/program/list", method = RequestMethod.GET)
    protected String viewProgram(Map<String, Object> map){
        map.put("program", new Program());
        map.put("programList", programService.listPrograms());

        return "program";
    }
    @RequestMapping(value="/production/add", method = RequestMethod.POST)
    protected String addProduction(@ModelAttribute("production")
                               Production production, BindingResult result)
            throws Exception {
        productionService.saveProduction(production);
        return "production";
    }

    @RequestMapping(value="/production/list", method = RequestMethod.GET)
    protected String viewProduction(Map<String, Object> map){
        map.put("production", new Production());
        map.put("productionList", productionService.listProductions());

        return "production";
    }
    @RequestMapping(value="/person/add", method = RequestMethod.POST)
    protected String addPerson(@ModelAttribute("person")
                               Person person, BindingResult result)
            throws Exception {
        personService.savePerson(person);
        return "person";
    }

    @RequestMapping(value="/person/list", method = RequestMethod.GET)
    protected String viewPerson(Map<String, Object> map){
        map.put("person", new Person());
        map.put("personList", personService.listPersons());

        return "person";
    }
    @RequestMapping(value="/parity/add", method = RequestMethod.POST)
    protected String addParity(@ModelAttribute("parity")
                               Parity parity, BindingResult result)
            throws Exception {
        parityService.saveParity(parity);
        return "parity";
    }

    @RequestMapping(value="/parity/list", method = RequestMethod.GET)
    protected String viewParity(Map<String, Object> map){
        map.put("parity", new Parity());
        map.put("parityList", parityService.listParitys());

        return "parity";
    }
    @RequestMapping(value="/locationLevel/add", method = RequestMethod.POST)
    protected String addLocationLevel(@ModelAttribute("locationLevel")
                               LocationLevel locationLevel, BindingResult result)
            throws Exception {
        locationLevelService.saveLocationLevel(locationLevel);
        return "locationLevel";
    }

    @RequestMapping(value="/locationLevel/list", method = RequestMethod.GET)
    protected String viewLocationLevel(Map<String, Object> map){
        map.put("locationLevel", new LocationLevel());
        map.put("locationLevelList", locationLevelService.listLocationLevels());

        return "locationLevel";
    }
    @RequestMapping(value="/location/add", method = RequestMethod.POST)
    protected String addLocation(@ModelAttribute("location")
                               Location location, BindingResult result)
            throws Exception {
        locationService.saveLocation(location);
        return "location";
    }

    @RequestMapping(value="/location/list", method = RequestMethod.GET)
    protected String viewLocation(Map<String, Object> map){
        map.put("location", new Location());
        map.put("locationList", locationService.listLocations());

        return "location";
    }
    @RequestMapping(value="/liveStokEvent/add", method = RequestMethod.POST)
    protected String addLiveStockEvent(@ModelAttribute("liveStokEvent")
                               LiveStockEvent liveStokEvent, BindingResult result)
            throws Exception {
        liveStockEventService.saveLiveStockEvent(liveStokEvent);
        return "liveStokEvent";
    }

    @RequestMapping(value="/liveStokEvent/list", method = RequestMethod.GET)
    protected String viewLiveStockEvent(Map<String, Object> map){
        map.put("liveStokEvent", new LiveStockEvent());
        map.put("liveStokEventList", liveStockEventService.listLiveStockEvents());

        return "liveStokEvent";
    }
    @RequestMapping(value="/kwitura/add", method = RequestMethod.POST)
    protected String addKwitura(@ModelAttribute("kwitura")
                               Kwitura kwitura, BindingResult result)
            throws Exception {
        kwituraService.saveKwitura(kwitura);
        return "kwitura";
    }

    @RequestMapping(value="/kwitura/list", method = RequestMethod.GET)
    protected String viewKwitura(Map<String, Object> map){
        map.put("kwitura", new Kwitura());
        map.put("kwituraList", kwituraService.listKwituras());

        return "kwitura";
    }
    @RequestMapping(value="/insemination/add", method = RequestMethod.POST)
    protected String addInsemination(@ModelAttribute("insemination")
                               Insemination insemination, BindingResult result)
            throws Exception {
        inseminationService.saveInsemination(insemination);
        return "insemination";
    }

    @RequestMapping(value="/insemination/list", method = RequestMethod.GET)
    protected String viewInsemination(Map<String, Object> map){
        map.put("insemination", new Insemination());
        map.put("inseminationList", inseminationService.listInseminations());

        return "insemination";
    }
    @RequestMapping(value="/girinka/add", method = RequestMethod.POST)
    protected String addGirinka(@ModelAttribute("girinka")
                               Girinka girinka, BindingResult result)
            throws Exception {
        girinkaService.saveGirinka(girinka);
        return "girinka";
    }

    @RequestMapping(value="/girinka/list", method = RequestMethod.GET)
    protected String viewGirinka(Map<String, Object> map){
        map.put("girinka", new Girinka());
        map.put("girinkaList", girinkaService.listGirinkas());

        return "girinka";
    }
    @RequestMapping(value="/cow/add", method = RequestMethod.POST)
    protected String addCow(@ModelAttribute("cow")
                               Cow cow, BindingResult result)
            throws Exception {
        cowService.saveCow(cow);
        return "cow";
    }

    @RequestMapping(value="/cow/list", method = RequestMethod.GET)
    protected String viewCow(Map<String, Object> map){
        map.put("cow", new Cow());
        map.put("cowList", cowService.listCow());

        return "cow";
    }
    @RequestMapping(value="/bull/add", method = RequestMethod.POST)
    protected String addBull(@ModelAttribute("bull")
                               Bull bull, BindingResult result)
            throws Exception {
        bullService.saveBull(bull);
        return "bull";
    }

    @RequestMapping(value="/bull/list", method = RequestMethod.GET)
    protected String viewBull(Map<String, Object> map){
        map.put("bull", new Bull());
        map.put("bullList", bullService.listBulls());

        return "bull";
    }
    @RequestMapping(value="/breed/add", method = RequestMethod.POST)
    protected String addBreed(@ModelAttribute("breed")
                               Breed breed, BindingResult result)
            throws Exception {
        breedService.saveBreed(breed);
        return "breed";
    }

    @RequestMapping(value="/breed/list", method = RequestMethod.GET)
    protected String viewBreed(Map<String, Object> map){
        map.put("breed", new Breed());
        map.put("breedList", breedService.listBreed());

        return "breed";
    }
}
