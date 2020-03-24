package com.br.jirehconfeccoes.distribution_company;

import com.br.jirehconfeccoes.utils.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "distribution_company")
public class DistributionCompany extends AbstractEntity {

    @Column(name = "razao_social")
    private String razaoSocial;
    @Column(name = "cnpj")
    private Integer cnpj;
    @Column(name = "inscricao_estadual")
    private Integer inscricaoEstadual;
    @Column(name = "email")
    private String email;
    @Column(name = "cep")
    private String cep;
    @Column(name = "street")
    private String street;
    @Column(name = "number_street")
    private Integer numberStreet;
    @Column(name = "neighborhood")
    private String neighborhood;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "phone")
    private String phone;

    public DistributionCompany() {
    }

    public DistributionCompany(String razaoSocial, Integer cnpj, Integer inscricaoEstadual, String email, String cep,
                               String street, Integer numberStreet, String neighborhood, String city,
                               String state, String phone) {
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

    public static DistributionCompany withoutDTO(DistributionCompanyDTO distributionCompanyDTO) {
        return new DistributionCompany(
                distributionCompanyDTO.getRazaoSocial(),
                distributionCompanyDTO.getCnpj(),
                distributionCompanyDTO.getInscricaoEstadual(),
                distributionCompanyDTO.getEmail(),
                distributionCompanyDTO.getCep(),
                distributionCompanyDTO.getStreet(),
                distributionCompanyDTO.getNumberStreet(),
                distributionCompanyDTO.getNeighborhood(),
                distributionCompanyDTO.getCity(),
                distributionCompanyDTO.getState(),
                distributionCompanyDTO.getPhone()
        );
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
        return "DistributionCompanyService{" +
                "razaoSocial='" + razaoSocial + '\'' +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DistributionCompany)) return false;
        if (!super.equals(o)) return false;

        DistributionCompany that = (DistributionCompany) o;

        if (getRazaoSocial() != null ? !getRazaoSocial().equals(that.getRazaoSocial()) :
                that.getRazaoSocial() != null)
            return false;
        if (getCnpj() != null ? !getCnpj().equals(that.getCnpj()) : that.getCnpj() != null) return false;
        if (getInscricaoEstadual() != null ? !getInscricaoEstadual().equals(that.getInscricaoEstadual()) :
                that.getInscricaoEstadual() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(that.getEmail()) : that.getEmail() != null) return false;
        if (getCep() != null ? !getCep().equals(that.getCep()) : that.getCep() != null) return false;
        if (getStreet() != null ? !getStreet().equals(that.getStreet()) : that.getStreet() != null) return false;
        if (getNumberStreet() != null ? !getNumberStreet().equals(that.getNumberStreet()) :
                that.getNumberStreet() != null)
            return false;
        if (getNeighborhood() != null ? !getNeighborhood().equals(that.getNeighborhood()) :
                that.getNeighborhood() != null)
            return false;
        if (getCity() != null ? !getCity().equals(that.getCity()) : that.getCity() != null) return false;
        if (getState() != null ? !getState().equals(that.getState()) : that.getState() != null) return false;
        return getPhone() != null ? getPhone().equals(that.getPhone()) : that.getPhone() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getRazaoSocial() != null ? getRazaoSocial().hashCode() : 0);
        result = 31 * result + (getCnpj() != null ? getCnpj().hashCode() : 0);
        result = 31 * result + (getInscricaoEstadual() != null ? getInscricaoEstadual().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getCep() != null ? getCep().hashCode() : 0);
        result = 31 * result + (getStreet() != null ? getStreet().hashCode() : 0);
        result = 31 * result + (getNumberStreet() != null ? getNumberStreet().hashCode() : 0);
        result = 31 * result + (getNeighborhood() != null ? getNeighborhood().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getState() != null ? getState().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        return result;
    }
}
