package com.br.jirehconfeccoes.distribution_company;

public class DistributionCompanyDTO {

    private Long id;
    private String razaoSocial;
    private Integer cnpj;
    private Integer inscricaoEstadual;
    private String email;
    private String cep;
    private String street;
    private Integer numberStreet;
    private String neighborhood;
    private String city;
    private String state;
    private String phone;

    public DistributionCompanyDTO() {
    }

    public DistributionCompanyDTO(Long id, String razaoSocial, Integer cnpj, Integer inscricaoEstadual,
                                  String email, String cep, String street, Integer numberStreet, String neighborhood,
                                  String city, String state, String phone) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.email = email;
        this.cep = cep;
        this.street = street;
        this.numberStreet = numberStreet;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.phone = phone;
    }

    public static DistributionCompanyDTO withDTO(DistributionCompany distributionCompany){
        return new DistributionCompanyDTO(
                distributionCompany.getId(),
                distributionCompany.getRazaoSocial(),
                distributionCompany.getCnpj(),
                distributionCompany.getInscricaoEstadual(),
                distributionCompany.getEmail(),
                distributionCompany.getCep(),
                distributionCompany.getStreet(),
                distributionCompany.getNumberStreet(),
                distributionCompany.getNeighborhood(),
                distributionCompany.getCity(),
                distributionCompany.getState(),
                distributionCompany.getPhone()
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(Integer inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumberStreet() {
        return numberStreet;
    }

    public void setNumberStreet(Integer numberStreet) {
        this.numberStreet = numberStreet;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "DistributionCompanyDTO{" +
                "id=" + id +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj=" + cnpj +
                ", inscricaoEstadual=" + inscricaoEstadual +
                ", email='" + email + '\'' +
                ", cep='" + cep + '\'' +
                ", street='" + street + '\'' +
                ", numberStreet=" + numberStreet +
                ", neighborhood='" + neighborhood + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
