import React from 'react';
import InstagramIcon from '@material-ui/icons/Instagram';
import FacebookIcon from '@material-ui/icons/Facebook';
import LinkedInIcon from '@material-ui/icons/LinkedIn';
import { Typography, Grid } from '@material-ui/core';
import { Box } from '@mui/material';
import './Footer.css'
import { useSelector } from 'react-redux';
import { TokenState } from '../../../store/tokens/tokensReducer';

function Footer() {

    const token = useSelector<TokenState, TokenState["tokens"]>(
        (state) => state.tokens
    );

    var footerComponent;

    if(token != ""){
        footerComponent =  <Grid container direction="row" className='bg-footer' justifyContent="center" alignItems="center">
        <Grid alignItems="center" item xs={12}>
            <Box className='box1'>
                <Box paddingTop={1} display="flex" alignItems="center" justifyContent="center">
                    <Typography variant="h5" align="center" gutterBottom className='textos'>Siga-me nas redes sociais :3 </Typography>
                </Box>
                <Box display="flex" alignItems="center" justifyContent="center">
                    <a href="https://www.facebook.com/giulia.faria.96" target="_blank">
                        <FacebookIcon className='redes'/>
                    </a>
                    <a href="https://www.instagram.com/giulia_lia_faria/" target="_blank">
                        <InstagramIcon className='redes'/>
                    </a>
                    <a href="https://www.linkedin.com/in/giulia-faria-36a23b22b/" target="_blank">
                        <LinkedInIcon className='redes'/>
                    </a>
                </Box>
            </Box>
            <Box className='box2'>
                <Box paddingTop={1}>
                    <Typography variant="subtitle2" align="center" gutterBottom className='textos'>© 2023 Copyright:</Typography>
                </Box>
                <Box>
                    <a target="_blank" href="">
                        <Typography variant="subtitle2" gutterBottom className='textos' align="center"></Typography>
                    </a>
                </Box>
            </Box>
        </Grid>
    </Grid>
    }
    return (
        <>
           {footerComponent}
        </>
    )
}

export default Footer;